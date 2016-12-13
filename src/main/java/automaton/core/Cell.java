package automaton.core;

import automaton.core.coords.CellCoordinates;
import automaton.core.state.CellState;

/**
 * Created by EwaStachów on 16/11/2016.
 * Klasa przechowuje stan pojedynczej komórki.
 */
public class Cell {
    public CellState state;
    public CellCoordinates coords;

    @Override
    public String toString() {
        return "Cell{" +
                "state=" + state +
                ", coords=" + coords +
                '}';
    }

    public Cell(CellCoordinates coords, CellState state) {
        this.state = state;
        this.coords = coords;
    }

    @Override
    public boolean equals(Object c) {
        return ((state == ((Cell) c).state) && (coords.equals(((Cell) c).coords)));
    }
}
