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

responseOne = WS.sendRequest(findTestObject('Soap/addRequest'))

responseTwo = WS.sendRequest(findTestObject('Soap/DivideRequest'))

responseThree = WS.sendRequest(findTestObject('Soap/multiPlyRequest'))

responseFour = WS.sendRequest(findTestObject('Soap/substractRequest'))

println WS.verifyElementText(responseOne, 'AddResponse.AddResult', '20')

println WS.verifyElementText(responseTwo, 'DivideResponse.DivideResult', '2')

println WS.verifyElementText(responseThree, 'MultiplyResponse.MultiplyResult', '20')

println WS.verifyElementText(responseFour, 'SubtractResponse.SubtractResult', '2')
