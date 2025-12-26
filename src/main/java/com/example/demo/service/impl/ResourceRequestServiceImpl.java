@Service
public class ResourceRequestServiceImpl implements ResourceRequestService {

    private final ResourceRequestRepository repo;
    private final UserRepository userRepo;

    public ResourceRequestServiceImpl(
            ResourceRequestRepository repo,
            UserRepository userRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
    }

    @Override
    public ResourceRequest createRequest(Long userId, ResourceRequest request) {
        request.setRequestedBy(userRepo.findById(userId).orElse(null));
        return repo.save(request);
    }

    @Override
    public List<ResourceRequest> getRequestsByUser(Long userId) {
        return repo.findRequestsByUser(userId);
    }

    @Override
    public ResourceRequest updateRequestStatus(Long id, String status) {
        ResourceRequest rr = repo.findById(id).orElse(null);
        if (rr != null) {
            rr.setStatus(status);
            return repo.save(rr);
        }
        return null;
    }
}
