package request.openimdirtywords;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("delete")
public class Delete  extends GeneralModel {
    @JSONField(name = "DirtyWordsList")
    private List<String> dirtyWordsList;
    public Delete(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(dirtyWordsList)){
            return "DirtyWordsList";
        }
        return null;
    }

    public List<String> getDirtyWordsList() {
        return dirtyWordsList;
    }

    public Delete setDirtyWordsList(List<String> dirtyWordsList) {
        this.dirtyWordsList = dirtyWordsList;return this;
    }
    public Delete setDirtyWordsList(String... dirtyWordsList) {
        if (this.dirtyWordsList==null){
            this.dirtyWordsList=new ArrayList<>();
        }
        Collections.addAll(this.dirtyWordsList,dirtyWordsList);
        return this;
    }
}
