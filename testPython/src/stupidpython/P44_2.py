# _*_ coding: utf-8 _*_

class Parent(object):
    def override(self):
        print "PARENT override()"
        
class Child(Parent):
    def override(self):
        print "CHILD override()"
        
dad = Parent()
son = Child()
dad.override()
son.override()