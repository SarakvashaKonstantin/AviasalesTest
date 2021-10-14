package base;

public abstract class BaseForm {
    private String name;
    private final BaseElement element;

    public BaseForm(BaseElement element, String name) {
        this.element = element;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }
}