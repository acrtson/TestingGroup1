package com.jalasoft.testing.pages;

/**
 * Created by Alex Alvarez on 5/13/2016.
 */
public class MainContainer extends AbstractBasePage{

    public Header goToHeader() {
        return new Header();
    }

    public TabBar goToTabBar() {
        return new TabBar();
    }

    public Footer goToFooter(){
        return new Footer();
    }

    //composicion de clases no es buena por que todas las veces que se llame al maincontainer se incia todas las clases
    /*private Header header;

    private TabBar tabBar;

    private Footer footer;

    public MainContainer() {
        header = new Header();
        tabBar = new TabBar();
        footer = new Footer();
    }

    public Header getHeader() {
        return header;
    }

    public TabBar getTabBar() {
        return tabBar;
    }

    public Footer getFooter() {
        return footer;
    }*/
}
