package controllers;


import model.Exception.AlreadyOccupatedException;
import model.Exception.InvalidPointException;
import model.Field;
import model.Figure;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws InvalidPointException,
                                                    AlreadyOccupatedException{
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupatedException();
        }
        field.setFigure(point, figure);
    };
}
