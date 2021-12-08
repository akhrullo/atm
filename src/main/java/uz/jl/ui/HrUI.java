package uz.jl.ui;

import java.util.Objects;

/**
 * @author Elmurodov Javohir, Wed 4:48 PM. 12/8/2021
 */
public class HrUI implements BaseUI{

    private static HrUI hrUI;

    public static HrUI getInstance() {
        if (Objects.isNull(hrUI)){
            return hrUI=new HrUI();
        }
        return hrUI;
    }

    private HrUI() {
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
