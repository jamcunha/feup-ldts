package pt.up.fe.ldts.gd.controller;

import pt.up.fe.ldts.gd.Game;
import pt.up.fe.ldts.gd.gui.GUI;

public abstract class Controller<T> {
    private final T template;

    public Controller(T template) {
        this.template = template;
    }

    public T getTemplate() {
        return template;
    }

    public abstract void step(Game game, GUI action);
}
