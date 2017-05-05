package urlmappingtest

class DisclosureSessionController {

    def show(String client, String session) {

        def disclosureSession = new DisclosureSession(client: client, session: session)
        disclosureSession.save()

        respond disclosureSession
    }
}
