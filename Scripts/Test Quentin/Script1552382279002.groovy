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

'je prie pour que ca marche'
WebUI.deleteAllCookies()


'ami de con'
WebUI.check(findTestObject('Page_taou  Interface communautaire/textarea_Message_et_pb_contact'))

WebUI.maximizeWindow()


WebUI.setViewPortSize(300, 500)

WebUI.click(findTestObject('Object Repository/Page_taou  Interface communautaire pour consommer local/img_DES GENS TRAVAILLENT TROP TARD POUR ACHETER EN DIRECT_wp-image-29057 alignnone size-full'))

'le test ultime'
WebUI.click(findTestObject('Page_taou  Interface communautaire/button_Envoi'))

'alléluia'
WebUI.check(findTestObject('Page_taou  Interface communautaire pour consommer local/img_DES GENS TRAVAILLENT TROP TARD POUR ACHETER EN DIRECT_wp-image-29057 alignnone size-full'))

'pour fabien <3'
WebUI.delay(10)
