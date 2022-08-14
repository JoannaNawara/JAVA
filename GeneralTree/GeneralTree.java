package search;

import java.util.LinkedList;
import java.util.List;

public class GeneralTree<T> implements ITree<T>{
    private T root;
    private LinkedList<ITree<T>> children;

    GeneralTree(T root){
        this.root = root;
        children = new LinkedList<>();
    }

    public void AddSubtree(T subtree){
        children.add((ITree<T>) subtree);
    }

    @Override
    public T Root(){
        return this.root;
    }

    @Override
    public boolean isLeaf(){
        return children.isEmpty();
    }

    @Override
    public int numberSubTrees(){
        return children.size();
    }

    @Override
    public int Height(){
        if(isLeaf())
            return 0;
        int max = 0;
        for(int i =0; i < children.size(); i++){
            int h = children.get(i).Height();
            if( h > max){
                max = h;
            }
        }
        return max;
    }

    @Override
    public List<T> preorder(){
        return _preorder(new LinkedList<>());
    }

    private List<T> _preorder(List<T> result){
        result.add(root);
        if(!isLeaf()){
            for ( ITree<T> subtree : children){
                ((GeneralTree)subtree)._preorder(result);
            }
        }
        return result;

    }

    @Override
    public List<T> inorder(){
        return _inorder(new LinkedList<>());
    }

    private List<T> _inorder(List<T> result){
        if(isLeaf()){
            result.add(root);
        }
        else{
            ((GeneralTree)children.get(0))._inorder(result);
            result.add(root);
            for (int i = 1; i < numberSubTrees(); i++) {
                ((GeneralTree)children.get(i))._inorder(result);
            }
        }
        return result;
    }

    @Override
    public List<T> postorder(){
        return _postorder(new LinkedList<>());
    }

    private List<T> _postorder(List<T> result){
        if(!isLeaf()){
            for (int i = 0; i < numberSubTrees(); i++) {
                ((GeneralTree) children.get(i))._postorder(result);
            }
        }
        result.add(root);
        return result;
    }

    @Override
    public ITree<T> getSubTree(int i){
        return children.get(i);
    }

}


