interface Editor {

    public void edit();

}

class CPlusPlusEditor implements Editor {

    @Override
    public void edit() {
        System.out.println("Edit C++ Code.");
    }

}

class IDE {

    private Editor editor;

    public IDE(Editor editor) {
        this.editor = editor;
    }

    public void editCode() {
        this.editor.edit();
    }

}

class JavaEditor implements Editor {

    @Override
    public void edit() {
        System.out.println("Edit Java Code.");
    }

}

/**
 * DependencyInversion
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Editor javaEditor = new JavaEditor();
        IDE ide = new IDE(javaEditor);
        ide.editCode();

        Editor cppEditor = new CPlusPlusEditor();
        IDE ide2 = new IDE(cppEditor);
        ide2.editCode();
    }
}