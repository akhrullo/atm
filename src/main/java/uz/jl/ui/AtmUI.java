package uz.jl.ui;

import java.util.Objects;

/**
 * @author Elmurodov Javohir, Wed 4:51 PM. 12/8/2021
 */
public class AtmUI implements BaseUI{

    private static AtmUI atmUI;

    public static AtmUI getInstance() {
        if (Objects.isNull(atmUI)){
            return atmUI=new AtmUI();
        }
        return atmUI;
    }

    private AtmUI() {
    }

    public void services(){

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
