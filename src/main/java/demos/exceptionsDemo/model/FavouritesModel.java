package demos.exceptionsDemo.model;

import java.util.*;

public class FavouritesModel {
    private final Map<String, Set<String> > favourites;

    public FavouritesModel() {
        this.favourites = new HashMap<>();
    }

    public void addUser(String name) throws FavouritesException {
        if (name == null) throw new IllegalArgumentException("name was null");
        if (name.isEmpty()) throw new FavouritesException("name cannot be empty");
        if (favourites.containsKey(name)) throw new FavouritesException("name " + name + " already exists");
        favourites.put(name, new HashSet<>());
    }

    public void addFavorite(String name, String favourite) throws FavouritesException {
        if (name == null) throw new IllegalArgumentException("name was null");
        if (favourite == null) throw new IllegalArgumentException("favourite was null");
        if (name.isEmpty()) throw new FavouritesException("name cannot be empty");
        if (favourite.isEmpty()) throw new FavouritesException("favourite cannot be empty");
        if (!favourites.containsKey(name)) throw new FavouritesException("cannot find name \"" + name + "\"");
        Set<String> favs = favourites.get(name);
        if (favs.contains(favourite)) throw new FavouritesException("favorite " + favourite + " for " + name + " already exists!");
        favs.add(favourite);
    }

    public Set<String> findFavourites(String name) throws FavouritesException {
        if (name == null) throw new IllegalArgumentException("name was null");
        if (name.isEmpty()) throw new FavouritesException("name cannot be empty");
        if (!favourites.containsKey(name)) throw new FavouritesException("cannot find name \"" + name + "\"");
        return Collections.unmodifiableSet(favourites.get(name));
    }
}
