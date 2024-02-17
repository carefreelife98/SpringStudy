package hello.core.member;

import java.awt.*;

public interface MemberRepository {
    void saver(Member member);

    Member findById(Long memberId);
}
