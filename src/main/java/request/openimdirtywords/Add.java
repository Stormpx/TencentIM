package request.openimdirtywords;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("add")
public class Add  extends GeneralModel {
    @JSONField(name = "DirtyWordsList")
    private List<String> dirtyWordsList;

    public Add(String serviceName) {
        super(serviceName);
    }

    public List<String> getDirtyWordsList() {
        return dirtyWordsList;
    }

    public Add setDirtyWordsList(List<String> dirtyWordsList) {
        this.dirtyWordsList = dirtyWordsList;return this;
    }
    public Add setDirtyWordsList(String... dirtyWordsList) {
        if (this.dirtyWordsList==null){
            this.dirtyWordsList=new ArrayList<>();
        }
        Collections.addAll(this.dirtyWordsList,dirtyWordsList);
        return this;
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(dirtyWordsList)){
            return "DirtyWordsList";
        }
        return null;
    }
}
