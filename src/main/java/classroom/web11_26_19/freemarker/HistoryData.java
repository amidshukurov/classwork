package classroom.web11_26_19.freemarker;

import java.util.ArrayList;
import java.util.List;

public class HistoryData {
    private List<String> add;
    private List<String> subt;
    private List<String> mult;
    private List<String> div;
    public List<List> getAll(){
        List<List> result = new ArrayList<>();
        if (getAdd()!=null) result.add(getAdd());
        if (getSubt()!=null) result.add(getSubt());
        if (getMult()!=null)result.add(getMult());
        if (getDiv()!=null) result.add(getDiv());
        return result;
    }
    public List<String> getAdd() {
        return add;
    }

    public void setAdd(List<String> add) {
        this.add = add;
    }

    public void setAdd1(String in) {
        List<String> r = new ArrayList<>();
        if(getAdd()!=null){
            r = getAdd();
            r.add(in);
            setAdd(r);
        } else {
            r.add(in);
            setAdd(r);
        }
    }

    public void setSubst1(String in) {
        List<String> r = new ArrayList<>();
        if(getSubt()!=null){
            r = getSubt();
            r.add(in);
            setSubt(r);
        } else {
            r.add(in);
            setSubt(r);
        }
    }

    public void setMult1(String in) {
        List<String> r = new ArrayList<>();
        if(getMult()!=null){
            r = getMult();
            r.add(in);
            setMult(r);
        } else {
            r.add(in);
            setMult(r);
        }
    }

    public void setDiv1(String in) {
        List<String> r = new ArrayList<>();
        if(getDiv()!=null){
            r = getDiv();
            r.add(in);
            setDiv(r);
        } else {
            r.add(in);
            setDiv(r);
        }
    }

    public List<String> getSubt() {
        return subt;
    }

    public void setSubt(List<String> subt) {
        this.subt = subt;
    }

    public List<String> getMult() {
        return mult;
    }

    public void setMult(List<String> mult) {
        this.mult = mult;
    }

    public List<String> getDiv() {
        return div;
    }

    public void setDiv(List<String> div) {
        this.div = div;
    }


}
