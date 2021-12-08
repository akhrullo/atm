package uz.jl.ui;

import java.util.Objects;

/**
 * @author Elmurodov Javohir, Wed 4:47 PM. 12/8/2021
 */
public class AdminUI implements BaseUI {


    private static AdminUI adminUI;

    public static AdminUI getInstance() {
        if (Objects.isNull(adminUI)){
            return adminUI=new AdminUI();
        }
        return adminUI;
    }

    private AdminUI() {
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
