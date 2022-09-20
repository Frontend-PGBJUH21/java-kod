public class GameObject {
    private boolean enabled;
    // kolla om game objekt är aktivt eller deaktivt
    private String name;
    // namn för game objekt, unikt namn
    private String tag;
    // ge tex alla traffic cars en tag med "traffic cars"

    public final boolean isEnabled() {
        return enabled;
    }

    public final void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public final String getName() {
        return name;
    }
    public final void setName(String name) {
        this.name = name;
    }
    public final String getTag() {
        return tag;
    }
    public final void setTag(String tag) {
        this.tag = tag;
    }

    // overridable method ingen abstrakt
    // default = gör ingenting. Vi har andra game objekts som inte går
    // att kollidera med.
    public void OnCollision(GameObject other){

    }

    // övriga metoder med final går ej att overrida

}
