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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.tutorialspoint.com/groovy/groovy_methods.htm')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Groovy - Methods/div_Tools'))

not_run: WebUI.switchToWindowIndex(1)

WebUI.switchToWindowTitle('Online Development and Testing Tools')

System.println(WebUI.getText(findTestObject('Page_Online Development and Testing Tools/span_Development Tools')))

System.println(WebUI.getUrl())

System.println(WebUI.getWindowTitle())

WebUI.switchToWindowUrl('https://www.tutorialspoint.com/groovy/groovy_methods.htm')

System.println(WebUI.getUrl())

System.println(WebUI.getWindowTitle())

WebUI.closeBrowser()

