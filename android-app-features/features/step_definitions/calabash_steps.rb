require 'calabash-android/calabash_steps'

Then(/^I see button with text "(.*?)"$/) do |btn_text|
  element_exists("button text:'#{btn_text}'")
end