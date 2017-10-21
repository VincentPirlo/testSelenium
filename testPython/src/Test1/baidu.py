#coding=utf-8
'''
Created on 2017年10月21日

@author: Vincent
'''

from selenium import webdriver
from time import sleep
driver = webdriver.Firefox(executable_path='C:\Program Files\Mozilla Firefox\geckodriver.exe')
driver.get("https://www.baidu.com")
driver.find_element_by_id("kw").send_keys("selenium3")
driver.find_element_by_id("su").click()
sleep(3)
driver.quit()
