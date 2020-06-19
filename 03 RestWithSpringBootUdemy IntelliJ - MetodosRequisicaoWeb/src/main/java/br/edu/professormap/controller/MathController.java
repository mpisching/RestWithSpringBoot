package br.edu.professormap.controller;

import br.edu.professormap.domain.SimpleMath;
import br.edu.professormap.exceptions.UnsuportedMathOperationException;
import br.edu.professormap.util.converters.NumberConverter;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    private SimpleMath simpleMath= new SimpleMath();

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!!");
        }
        return simpleMath.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/subtract/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtract(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!!");
        }
        //Double diff = convertToDouble(numberOne) - convertToDouble(numberTwo);
        return simpleMath.subtract(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/multiply/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiply(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!!");
        }
        //Double result = convertToDouble(numberOne) * convertToDouble(numberTwo);
        return simpleMath.multiply(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/divide/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double divide(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!!");
        }
        //Double result = convertToDouble(numberOne) / convertToDouble(numberTwo);
        return simpleMath.divide(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double media(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!!");
        }
        //Double result = (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2D;
        return simpleMath.media(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/sqrt/{numberOne}", method = RequestMethod.GET)
    public Double sqrt(@PathVariable("numberOne") String numberOne) throws Exception {
        if (!NumberConverter.isNumeric(numberOne)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!!");
        }
        //Double result = Math.sqrt(convertToDouble(numberOne));
        return simpleMath.sqrt(NumberConverter.convertToDouble(numberOne));
    }

//    private Double convertToDouble(String strNumber) {
//        if (strNumber == null) return 0D;
//        String number = strNumber.replaceAll(",",".");
//        if (isNumeric(strNumber)) return Double.parseDouble(strNumber);
//        return 0D;
//    }
//
//    private boolean isNumeric(String strNumber) {
//        if (strNumber == null) return false;
//        String number = strNumber.replaceAll(",",".");
//        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
//    }
}
