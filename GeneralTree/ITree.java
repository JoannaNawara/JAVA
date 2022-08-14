package search;

import java.util.List;

public interface ITree<T> {
    T Root();
    boolean isLeaf();
    int numberSubTrees();
    ITree<T> getSubTree(int i);
    int Height();
    List<T> preorder();
    List<T> inorder();
    List<T> postorder();
}
