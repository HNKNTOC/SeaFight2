package hnkntoc.com.seafight2.Game.Calculate;

import android.util.Log;

import hnkntoc.com.seafight2.Game.Field.Cell;
import hnkntoc.com.seafight2.Game.Object.GameObject;
import hnkntoc.com.seafight2.Game.Object.Indent;
import hnkntoc.com.seafight2.Game.Object.Ship;

/**
 * Created by HNKNTOC on 11.11.2015.
 */
public class ShipDraw extends CalculateCoorShip {

    public ShipDraw(Cell[][] listCell, Ship ship) {
        super(listCell, ship, ship.getColumns(), ship.getRows());
        super.columns--;
        super.rows--;
    }

    @Override
    protected void actionShip(int columns, int rows) {
        Log.i("ActionGrap kr", "" + columns + ";" + rows + "=" + listCell[columns][rows].toString());
        Cell cell = listCell[columns][rows];
        cell.setGameObject(ship);
    }

    @Override
    protected void actionIndent(int columns, int rows) {
        Log.i("ActionGrap krestik", "" + columns + ";" + rows + "=" + listCell[columns][rows].toString());
        Cell cell = listCell[columns][rows];
        GameObject gameObject = cell.getGameObject();
        if(gameObject==null){
            cell.setGameObject(new Indent(columns,rows));
        }else {
            cell.getGameObject().add(listCell);
        }
    }

    @Override
    public boolean action() {
        ShipCheck check = new ShipCheck(listCell,ship,columns,rows);
        if (!check.action()) {
            return false;
        }
        calculateCell();
        return true;
    }
}
