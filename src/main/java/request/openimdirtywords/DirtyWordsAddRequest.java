package request.openimdirtywords;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("add")
public class DirtyWordsAddRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "DirtyWordsList")
    private List<String> dirtyWordsList;

    public DirtyWordsAddRequest(String serviceName) {
        super(serviceName);
    }

    public List<String> getDirtyWordsList() {
        return dirtyWordsList;
    }

    public DirtyWordsAddRequest setDirtyWordsList(List<String> dirtyWordsList) {
        this.dirtyWordsList = dirtyWordsList;return this;
    }
    public DirtyWordsAddRequest setDirtyWordsList(String... dirtyWordsList) {
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
