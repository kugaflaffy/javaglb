package com.example.paint.shapes.interfaces;

import java.util.UUID;

import com.example.paint.commands.CommandContext;
import com.example.paint.core.InputValidator;
import com.example.paint.core.RegisterShape;
import com.example.paint.shapes.Circle;
import com.example.paint.shapes.Shape;

@RegisterShape("circle")
public class CircleCreator implements InteractiveCreatable {

    @Override
    public Shape createFromInput(CommandContext context) {
        var writer = context.getOut();
        var input = context.getScanner();
        
        double x = InputValidator.readDouble(writer, input, "x: ");
        double y = InputValidator.readDouble(writer, input, "y: ");
        double r = InputValidator.readDouble(writer, input, "radio: ");

        return new Circle(UUID.randomUUID(), x, y, r);
    }

}
