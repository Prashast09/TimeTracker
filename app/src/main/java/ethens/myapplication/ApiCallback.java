package ethens.myapplication;

/**
 * Created by ethens on 29/09/17.
 */

@FunctionalInterface public interface ApiCallback<T,V> {

    T onResponse(V from);


}
