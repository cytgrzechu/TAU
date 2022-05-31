import pytest

from main import square
from main import divide
from main import multiply
from main import add
from main import power
from main import subtract





@classmethod
def setup_class(cls):
        print('\n----rozpoczecie testowania pierwiastkow ----')

@classmethod
def teardown_class(cls):
        print('\n----zakonczenie testowania pierwiastkow----')

class FunkcjaPierwiastek:
    paramPierwiastek = [(9,3), (16,4)]
    paramBlad = [(4,14), (16,16)]

    @pytest.mark.parametrize("num1, result", paramPierwiastek)
    def test_square(num1, result):
        assert square(num1) == result

    @pytest.mark.parametrize("num1, result", paramBlad)
    def test_square(num1, result):
        with pytest.raises(ValueError):
            assert square(num1) == result

@classmethod
def setup_class(cls):
        print('\n----rozpoczecie testowania dodawania ----')

@classmethod
def teardown_class(cls):
        print('\n----zakonczenie testowania dodawania----')
   

class TestFunkcjaDodawanie:
    paramDodawanie = [(1, 2, 3), (4, 5, 9), (-2, 6, 4)]
    paramDodawanieBlad = [(2, 2, 34), (43, 53, 93), (-23, 63, 43)]
    paramDodawanieBlad2 = [(2, True, 34), (43, False, 93), (-23, False, 43)]
    @pytest.mark.parametrize("num1, num2, result", paramDodawanie)
    def test_add(num1, num2, result):
        assert add(num1, num2) == result 
    
    @pytest.mark.parametrize("num1, num2, result", paramDodawanieBlad)
    def test_addBlad(num1, num2, result):
        with pytest.raises(ValueError):
            assert add(num1, num2) == result   

    @pytest.mark.parametrize("num1, num2, result", paramDodawanieBlad2)
    def test_addBlad2(num1, num2, result):
        with pytest.raises(ValueError):
            assert add(num1, num2) == result        

@classmethod
def setup_class(cls):
        print('\n----rozpoczecie testowania mnozenia ----')

@classmethod
def teardown_class(cls):
        print('\n----zakonczenie testowania mnozenia----')

class TestFunkcjaMnozenie:   
    paramMnozenie = [(2, 2, 4), (10, 5, 50), (5, 6, 30)]
    paramMnozenieBlad = [(2, 5, 4), (10, 55, 50), (55, 6, 30)]
    @pytest.mark.parametrize("num1, num2, result", paramMnozenie)
    def test_multiply(num1, num2, result):
        assert multiply(num1, num2) == result

    @pytest.mark.parametrize("num1, num2, result", paramMnozenieBlad)
    def test_multiply(num1, num2, result):
        with pytest.raises(ValueError):
            assert multiply(num1, num2) == result    



class TestFunkcjaDzielenie:
    paramDzielenie = [(4,2,2), (4,4,1)]
    paramDzielenieBlad = [(4,0,2), (4,7,1)]
    @pytest.mark.parametrize("num1, num2, result", paramDzielenie)
    def test_divide(num1, num2, result):
         assert divide(num1, num2) == result

    @pytest.mark.parametrize("num1, num2, result", paramDzielenieBlad)
    def test_divideBlad(num1, num2, result):
         assert divide(num1, num2) == result


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

