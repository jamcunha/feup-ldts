package pt.up.fe.ldts.gd.controller.town;

import pt.up.fe.ldts.gd.Game;
import pt.up.fe.ldts.gd.controller.Controller;
import pt.up.fe.ldts.gd.gui.GUI;
import pt.up.fe.ldts.gd.model.menu.Menu;
import pt.up.fe.ldts.gd.model.player.Item;
import pt.up.fe.ldts.gd.model.player.Player;
import pt.up.fe.ldts.gd.model.town.Shop;
import pt.up.fe.ldts.gd.model.town.ShopStrategy;
import pt.up.fe.ldts.gd.state.menu.MenuState;

import java.io.IOException;
import java.util.List;

public class ShopController extends Controller<Shop> {
    private List<Item> items;
    public ShopController(Shop shop) {
        super(shop);
        this.items = getModel().getItems();
    }

    @Override
    public void step(Game game, GUI.ACTION action) throws IOException {
        if(action == GUI.ACTION.OPT0) {
            game.setState(new MenuState(new Menu()));
        }
        if(action == GUI.ACTION.OPT9) {
            game.setState(game.getPreviousState());
        }
        if(action == GUI.ACTION.OPT1 && items.size() >= 1) {
            if(getModel().buyItem(items.get(0)))
                getModel().setMessage("You bought " + items.get(0).getName() + " successfully!");
            else
                getModel().setMessage("You don't have enough gold!");
        }
        if(action == GUI.ACTION.OPT2 && items.size() >= 2) {
            if(getModel().buyItem(items.get(1)))
                getModel().setMessage("You bought " + items.get(1).getName() + " successfully!");
            else
                getModel().setMessage("You don't have enough gold!");
        }
        if(action == GUI.ACTION.OPT3 && items.size() >= 3) {
            if(getModel().buyItem(items.get(2)))
                getModel().setMessage("You bought " + items.get(2).getName() + " successfully!");
            else
                getModel().setMessage("You don't have enough gold!");
        }
        if(action == GUI.ACTION.OPT4 && items.size() >= 4) {
            if(getModel().buyItem(items.get(3)))
                getModel().setMessage("You bought " + items.get(3).getName() + " successfully!");
            else
                getModel().setMessage("You don't have enough gold!");
        }
        if(action == GUI.ACTION.OPT5 && items.size() >= 5) {
            if(getModel().buyItem(items.get(4)))
                getModel().setMessage("You bought " + items.get(4).getName() + " successfully!");
            else
                getModel().setMessage("You don't have enough gold!");
        }
    }
}
