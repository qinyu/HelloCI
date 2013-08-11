require 'calabash-android/calabash_steps'

def wait_for_webview_refresh(timeout=30, interval=1)
  if element_exists("webView")
    begin
      Timeout::timeout(timeout) do
        sleep interval while performAction("get_load_progress")["message"] != "100"
      end
      yield
    rescue Timeout::Error
      raise "Could not load page in #{timeout} seconds"
    end
  else
    raise "Could not find webView"
  end
end

Given(/^I am on the "(.*?)" page$/) do |title|
  wait_for_webview_refresh do
    res = query("webView css:'.ui-title'")[0]["textContent"]
    if (title != res)
      raise "The page's title is not '#{title}'"
    end
  end
end

Then(/^I enter text "(.*?)" into field with id "(.*?)" in the page$/) do |text, id|
  set_text("webView css:\##{id}", text)
end

Then(/^I press the "(.*?)" button in the page$/) do |text|
  res = false
  elements = query("webView css:'*'").select {|el| el["textContent"] == text}
  elements.each do |element|
    res = touch(element)
    if res["success"]
      res = true
    end
  end

  if not res
    raise "Could not find input '#{text}'"
  end

end

Then(/^I wait for current page refresh$/) do
  wait_for_webview_refresh {}
end

Then(/^I should go to "(.*?)" page$/) do |title|
  steps %Q{
    Given I am on the "#{title}" page
  }
end

Then(/^I see button with text "(.*?)"$/) do |btn_text|
  element_exists("button text:'#{btn_text}'")
end

Then(/^I see button with text "(.*?)"$/) do |btn_text|
  element_exists("button text:'#{btn_text}'")
end
