import pytest

from main import square
from main import divide
from main import multiply
from main import add
from main import power
from main import subtract

class FunkcjaPierwiastek:
    def test_square_9():
        results = square(9)
        assert results == 3
    def test_square_16():
        results = square(16)
        assert results == 4

class TestFunkcjaDzielenie:

    def test_divide():
         results = divide(6, 2)
         assert results == 3
    def test_divide_by_zero():
         results = divide(99, 0)
         assert type(results) == str

class TestFunkcjaMnozenie:   
    def test_multiply():
        
        assert multiply(2,1) == 3

class TestFunkcjaDodawanie:
    def test_add():
        
        assert add(2,1) == 3    

class TestFunkcjaPotegowanie: 
    def test_power():
        results = power(3, 2)
        assert results == 9
    def test_power3_3():
        results = power(3, 3)
        assert results == 27     

class TestFunkcjaOdejmowanie:    
    def test_subtract():
        results = subtract(10, 7)
        assert results == 3    

