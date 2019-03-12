import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.taou.ch/')

WebUI.click(findTestObject('Page_taou  Interface communautaire/button_Envoi'))

WebUI.rightClick(findTestObject('Object Repository/Page_taou  Interface communautaire/input_Nom_et_pb_contact_nom_1'))

WebUI.rightClick(findTestObject('Object Repository/Page_taou  Interface communautaire/div_CONTACTTAOU est un projet '))

WebUI.rightClick(findTestObject('Object Repository/Page_taou  Interface communautaire/input_Email_et_pb_contact_emai'))

WebUI.rightClick(findTestObject('Object Repository/Page_taou  Interface communautaire/textarea_Message_et_pb_contact'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_taou  Interface communautaire/select_Je mintresse  TAOU en t'), 
    'Consommateur', true)

