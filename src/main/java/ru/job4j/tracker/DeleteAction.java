package ru.job4j.tracker;

public class DeleteAction implements  UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Delete item");
        int id = input.askInt("Enter id: ");
        boolean rsl = tracker.delete(id);
        if (rsl) {
            System.out.println("Successful");
        } else {
            System.out.println("id not found");
        }
        return true;
    }
}
