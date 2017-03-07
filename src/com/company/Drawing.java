package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dande on 19-2-2017.
 */
@SuppressWarnings("DefaultFileTemplate")
public class Drawing {
    private String name;
    private List<DrawingItem> items;


public Drawing(String name) {
    this.name = name;
    items = new ArrayList<>();
}
public void addDrawingItem(DrawingItem d){
    items.add(d);
}

public void changeItem(DrawingItem itemToChange,DrawingItem newItem){
    int indexToChange = -1;
    for(int i = 0; i < items.size(); i++){
        if(items.get(i).toString().equals(itemToChange.toString())){
            indexToChange = i;
            break;
        }
    }
    if(indexToChange != -1){
        items.remove(indexToChange);
        items.add(newItem);
    }else System.out.println("No item matches itemToChange");

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DrawingItem> getItems() {
        return items;
    }

    public void setItems(List<DrawingItem> items) {
        this.items = items;
    }



    public void sortList(){

    }
    public String toString(){

    String output = "";
        for (DrawingItem d:items) {
            output = output + " "+ d.toString();
        }
        return output;
    }
}
