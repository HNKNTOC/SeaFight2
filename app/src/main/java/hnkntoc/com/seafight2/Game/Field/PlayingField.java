package hnkntoc.com.seafight2.Game.Field;


import hnkntoc.com.seafight2.Game.Clikc.HandlerCellClick;
import hnkntoc.com.seafight2.Game.Object.GameObject;

/**
 * Created by HNKNTOC on 19.11.2015.
 */
public class PlayingField {
    private Cell[][] listCell;

    public PlayingField(Cell[][] listCell) {
        this.listCell = listCell;
    }

    public boolean AddGameObject(GameObject gameObject,int columns,int rows){
        return gameObject.add(listCell);
    }

    public boolean onClikc(int columns,int rows,HandlerCellClick handlerCellClick){

        return handlerCellClick.OnClick(listCell,columns,rows);
    }

}
