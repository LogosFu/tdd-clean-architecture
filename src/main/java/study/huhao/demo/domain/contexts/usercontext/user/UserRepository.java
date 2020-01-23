package study.huhao.demo.domain.contexts.usercontext.user;

import java.util.Optional;
import java.util.UUID;
import study.huhao.demo.domain.core.common.Page;
import study.huhao.demo.domain.core.concepts.Repository;

public interface UserRepository extends Repository {

  void save(User blog);

  Optional<User> findById(UUID id);

  boolean existsById(UUID id);

  void deleteById(UUID id);

  Page<User> findAllWithPagination(UserCriteria criteria);
}
