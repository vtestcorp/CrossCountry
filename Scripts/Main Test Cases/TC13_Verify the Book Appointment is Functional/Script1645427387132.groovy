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

WebUI.comment('Checking functionality of Book Appointment.')

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Page_Login/txt_UserName'), findTestData('TestData').getValue(1, 1))

WebUI.setText(findTestObject('Page_Login/txt_Password'), findTestData('TestData').getValue(2, 1))

WebUI.click(findTestObject('Page_Login/btn_Login'))

WebUI.click(findTestObject('Page_AppointmentConfirmation/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Page_AppointmentConfirmation/div_Visit Date (Required)_input-group-addon'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/td_28'))

WebUI.setText(findTestObject('Page_AppointmentConfirmation/textarea_Comment_comment'), 'This is comment while Booking an appointment')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Page_AppointmentConfirmation/h2_Appointment Confirmation'), GlobalVariable.G_ShortTimeOut)

WebUI.closeBrowser()

