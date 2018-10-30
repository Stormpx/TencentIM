package request.openimdirtywords;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("delete")
public class DirtyWordsDeleteRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "DirtyWordsList")
    private List<String> dirtyWordsList;
    public DirtyWordsDeleteRequest(String serviceName) {
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

    public DirtyWordsDeleteRequest setDirtyWordsList(List<String> dirtyWordsList) {
        this.dirtyWordsList = dirtyWordsList;return this;
    }
    public DirtyWordsDeleteRequest setDirtyWordsList(String... dirtyWordsList) {
        if (this.dirtyWordsList==null){
            this.dirtyWordsList=new ArrayList<>();
        }
        Collections.addAll(this.dirtyWordsList,dirtyWordsList);
        return this;
    }
}
