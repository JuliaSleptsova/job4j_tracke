package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Edit item");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter new name item: ");
        Item item = new Item(name);
        boolean rsl = tracker.replace(id, item);
        if (rsl) {
            System.out.println("Successful");
        } else {
            System.out.println("id not found");
        }
        return true;
    }
}
