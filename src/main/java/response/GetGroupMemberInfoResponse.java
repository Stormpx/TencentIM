package response;

import model.GroupMember;

import java.util.List;

public class GetGroupMemberInfoResponse extends GeneralResponse{
    private Integer MemberNum;
    private List<GroupMember> MemberList;

    public Integer getMemberNum() {
        return MemberNum;
    }

    public void setMemberNum(Integer memberNum) {
        MemberNum = memberNum;
    }

    public List<GroupMember> getMemberList() {
        return MemberList;
    }

    public void setMemberList(List<GroupMember> memberList) {
        MemberList = memberList;
    }

    public static void main(String[] args) {
        GeneralResponse.test("{\"MemberNum\": 2, // 本群组的群成员总数\n" +
                "\"MemberList\": [  // 群成员列表\n" +
                "    {\n" +
                "        \"Member_Account\": \"bob\",\n" +
                "        \"Role\": \"Owner\",\n" +
                "        \"JoinTime\": 1425976500, // 入群时间\n" +
                "        \"MsgSeq\": 1233,\n" +
                "        \"MsgFlag\": \"AcceptAndNotify\",\n" +
                "        \"LastSendMsgTime\": 1425976500, // 最后一次发消息的时间\n" +
                "        \"ShutUpUntil\": 1431069882, // 禁言截至时间（秒数）\n" +
                "        \"AppMemberDefinedData\":[ //群成员自定义字段\n" +
                "            {\n" +
                "               \"Key\":\"MemberDefined1\",\n" +
                "               \"Value\":\"ModifyDefined1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"Key\":\"MemberDefined2\",\n" +
                "                \"Value\":\"ModifyDefined2\"\n" +
                "            }\n" +
                "         ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"Member_Account\": \"peter\",\n" +
                "        \"Role\": \"Member\",\n" +
                "        \"JoinTime\": 1425976500,\n" +
                "        \"MsgSeq\": 1233,\n" +
                "        \"MsgFlag\": \"AcceptAndNotify\",\n" +
                "        \"LastSendMsgTime\": 1425976500,\n" +
                "        \"ShutUpUntil\": 0, // 0表示未被禁言，否则为禁言的截止时间\n" +
                "        \"AppMemberDefinedData\": [ //群成员自定义字段\n" +
                "            {\n" +
                "               \"Key\": \"MemberDefined1\",\n" +
                "               \"Value\": \"ModifyDefined1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"Key\": \"MemberDefined2\",\n" +
                "                \"Value\": \"ModifyDefined2\"\n" +
                "            }\n" +
                "         ]\n" +
                "    }\n" +
                "]}",GetGroupMemberInfoResponse.class);
    }
}
