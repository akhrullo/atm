package uz.jl.ui;

import java.util.Objects;

/**
 * @author Elmurodov Javohir, Wed 4:50 PM. 12/8/2021
 */
public class ClientUI implements BaseUI{

    private static ClientUI clientUI;

    public static ClientUI getInstance() {
        if (Objects.isNull(clientUI)){
            return clientUI=new ClientUI();
        }
        return clientUI;
    }

    private ClientUI() {
    }

    public void orderCard(){

    }

    @Override
    public void create() {

    }

    @Override
    public void block() {

    }

    @Override
    public void unblock() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void list() {

    }
}

