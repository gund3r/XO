package Controllers;


import Model.Exception.AlreadyOccupatedException;
import Model.Exception.InvalidPointException;
import Model.Field;
import Model.Figure;

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
