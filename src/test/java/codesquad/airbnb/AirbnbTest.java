package codesquad.airbnb;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class AirbnbTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    @DisplayName("Test case 1) 1 == 1")
    void test1() {
        assertThat(1).isEqualTo(1);
    }

    @Test
    @DisplayName("Test case 2) 2 > 1")
    void test2() {
        assertThat(2).isGreaterThan(1);
    }

    @Test
    @DisplayName("Test case 3) JPA Test")
    void test3() {
        // given
        Member member = new Member();
        member.setName("jwkim");

        // when
        Member savedMember = memberRepository.save(member);

        // then
        assertThat(savedMember.getName()).isEqualTo(member.getName());
    }
}
