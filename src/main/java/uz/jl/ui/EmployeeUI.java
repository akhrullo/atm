package uz.jl.ui;

import java.util.Objects;

/**
 * @author Elmurodov Javohir, Wed 4:49 PM. 12/8/2021
 */
public class EmployeeUI implements BaseUI{

    private static EmployeeUI employeeUI;

    public static EmployeeUI getInstance() {
        if (Objects.isNull(employeeUI)){
            return employeeUI=new EmployeeUI();
        }
        return employeeUI;
    }

    private EmployeeUI() {
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
