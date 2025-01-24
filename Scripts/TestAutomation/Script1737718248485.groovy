import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(null)
WebUI.maximizeWindow()
WebUI.navigateToUrl("https://www.pos.com.my/send/ratecalculator")

WebUI.setText(findTestObject('Object Repository/POS MALAYSIA - Rate Calculator Page/postcodeFrom_text'), '35600')
Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/POS MALAYSIA - Rate Calculator Page/countryTo_dropdown_text'))
WebUI.setText(findTestObject('Object Repository/POS MALAYSIA - Rate Calculator Page/countryTo_dropdown_text'),'india')
Thread.sleep(2000)
WebUI.click(findTestObject('Object Repository/POS MALAYSIA - Rate Calculator Page/countryToIndia_value'))

WebUI.setText(findTestObject('Object Repository/POS MALAYSIA - Rate Calculator Page/Weight_text'),'1')

WebUI.click(findTestObject('Object Repository/POS MALAYSIA - Rate Calculator Page/Calculate_button'))
Thread.sleep(2000)

WebUI.scrollToElement(findTestObject('Object Repository/POS MALAYSIA - Rate Calculator Page/Your Quote_label'),0)
Thread.sleep(2000)

WebUI.verifyElementVisible(findTestObject('Object Repository/POS MALAYSIA - Rate Calculator Page/EMS_label')) //Quote1
WebUI.verifyElementVisible(findTestObject('Object Repository/POS MALAYSIA - Rate Calculator Page/International Air Parcel_label')) //Quote2
WebUI.verifyElementVisible(findTestObject('Object Repository/POS MALAYSIA - Rate Calculator Page/International Surface Parcel_label')) //Quote3


WebUI.closeBrowser()

