package com.kodilla.stream.beautifier;

import com.kodilla.stream.lambda.MathExpression;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }
}