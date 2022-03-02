package com.custom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {
	@Keyword
	def loginKeyword() {
		WebUI.openBrowser(GlobalVariable.G_SiteURL)

		WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

		WebUI.setText(findTestObject('Page_Login/txt_UserName'), findTestData('TestData').getValue(1, 1))

		WebUI.setText(findTestObject('Page_Login/txt_Password'), findTestData('TestData').getValue(2, 1))

		WebUI.click(findTestObject('Page_Login/btn_Login'))

		WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))
	}
}