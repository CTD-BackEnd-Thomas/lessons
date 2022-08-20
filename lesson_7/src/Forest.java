import java.util.ArrayList;
import java.util.List;

public class Forest {

    private List<Tree> trees = new ArrayList<>();

    public void plantTree( String name, String color, int height, int width) {

        TreeType type = TreeFactory.getTreeType(name,color,height,width);

        Tree tree = new Tree(type);

        trees.add(tree);

    }

    public List<Tree> getTrees() {
        return trees;
    }

    @Override
    public String toString() {
        return "Forest{" +
                "trees=" + trees +
                '}';
    }
}
