package ma.emsi.elmahiaya.tp1.llm;

/**
 * Résultat d'une interaction avec le LLM :
 * le JSON de la requête envoyée, le JSON de la réponse reçue
 * et le texte de la réponse à afficher à l'utilisateur.
 */
public record LlmInteraction(String questionJson, String reponseJson, String reponseExtraite) {
}
