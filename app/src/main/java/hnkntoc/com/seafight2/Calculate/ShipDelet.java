package hnkntoc.com.seafight2.Calculate;


import hnkntoc.com.seafight2.Game.Field.Cell;
import hnkntoc.com.seafight2.Game.Ship;

/**
 * Created by HNKNTOC on 14.11.2015.
 */
public class ShipDelet extends CalculateCoor {

    public ShipDelet(Cell[][] listCell, Ship ship, int columns, int rows) {
        super(listCell, ship, columns, rows);
        super.columns--;
        super.rows--;
    }

    @Override
    protected void actionShip(int columns, int rows) {
        Cell cell = listCell[columns][rows];
        cell.setGameObject(null);
    }

    @Override
    protected void actionIndent(int columns, int rows) {
        Cell cell = listCell[columns][rows];
        if(cell.getGameObject()!=null){
            cell.getGameObject().destruction(listCell,columns,rows);
        }
    }

    @Override
    public boolean action() {
        return super.action();
    }
}