package gateway.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum MemberType {

    ADMIN("ADMIN", "사이트 운영자"),
    NORMAL("NORMAL", "일반 사용자");

    private String name;
    private String description;
}
