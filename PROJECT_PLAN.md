# Godsunder: Oaths of the Fallen — documento di avvio

> **Stato:** bozza di lavoro. Nome provvisorio; nessuna decisione narrativa o tecnica definitiva è approvata. Il documento registra preferenze e ipotesi, non compatibilità già testate.

## 1. Sintesi e stato delle decisioni

### Confermato come obiettivo
- Modpack pubblico per Minecraft Java, creato da tre amici, giocabile in singolo e in cooperativa.
- Esperienza dark medieval fantasy, RPG impegnativo ma equo, con esplorazione, progressione, fazioni, rovine e conseguenze.
- Prima milestone verticale: **La prima spedizione**, 60–90 minuti, provabile da soli e in tre.
- Pubblicazione desiderata su CurseForge; test distribuibili come `.mrpack` quando il percorso è fattibile.
- Rispetto delle licenze, contenuti originali e test incrementali sono requisiti di processo.

### Preferenze, non ancora decisioni
- Minecraft 1.20.1 + Forge; Laby Launcher; sessioni iniziali ospitate dal giocatore con e4mc o Essential.
- Apotheosis, Relics, Reliquified Artifacts; shader/PBR e audio originali.
- MIT per il codice originale, subordinata all'accordo di titolari e contributori.

### Ipotesi da convalidare
- La base tecnica soddisfa le funzioni prioritarie e i launcher riescono a installare/esportare il test.
- La co-op senza hosting a pagamento soddisfa affidabilità, privacy e capacità richieste. Il target di 10 giocatori non è supportato finché non superato da test; Essential, secondo la richiesta iniziale, va verificato rispetto al limite documentato di 8.
- Le funzioni desiderate delle mod citate sono presenti nelle versioni e loader selezionati, e possono essere distribuite nei limiti delle rispettive condizioni.

## 2. Incognite e rischi principali
1. **Capacità del team:** programmazione, Java/Forge, datapack/KubeJS, arte 2D/3D, audio, QA e tempo reale disponibile.
2. **Scelta della piattaforma:** costo di restare su Forge 1.20.1 rispetto a 1.21.1/loader alternativi, incluse mod, shader, toolchain e aggiornamenti.
3. **Scope:** sistemi di loot, progressione, boss, worldgen e contenuti originali possono moltiplicare configurazione e QA.
4. **Bilanciamento co-op:** scaling, ricompense, progressione condivisa, giocatori assenti e prestazioni con gruppi diversi.
5. **Distribuzione:** dipendenze, download non automatici, permessi, policy CurseForge e test pulito del flusso ufficiale.
6. **Identità creativa:** evitare di trasformare ispirazioni in imitazioni; nome e lore restano aperti.
7. **Qualità audiovisiva:** PBR/shader sono costosi e opzionali; leggibilità e prestazioni devono funzionare anche senza shader.

## 3. Struttura di lavoro proposta

### Notion
- **Home / Decision log:** decisioni con stato (proposta, verificata, testata, approvata, scartata), motivazione, data e responsabile.
- **Roadmap e milestone:** obiettivi, owner, dipendenze, rischi, criteri di completamento e risultati dei test.
- **Research / Mod registry:** una riga per candidata: pagina ufficiale, file esatto, MC/loader, dipendenze, lato client/server, ruolo, licenza/distribuzione, rischi, stato.
- **Design bible:** pilastri, tono, loop, progressione, combattimento, lore (sezioni spoiler protette), glossario originale.
- **Playtest & QA:** build/hash, launcher, hardware, seed/mondo usa-e-getta, configurazione, giocatori, passaggi, risultati, log redatti e bug collegati.
- **Asset & provenance:** autore, origine, licenza/permesso, file sorgente, crediti, uso previsto.
- **Task board:** backlog → pronto → in corso → review → test → fatto; assegnazione e stima breve.

### GitHub
- Issues per bug, ricerca tracciabile e task; milestone per fasi/build.
- Projects per board operativa; Discussions per decisioni non ancora fissate.
- Repository ordinato in `docs/`, `mod/` (solo quando necessario), `pack/`, `resourcepack/`, `shader/`, `scripts/` e `tests/` secondo effettivo bisogno. Non creare tutti i moduli prima di averne validato la necessità.
- Template per issue/PR, versioni semantiche o schema concordato, CI per build/lint dove applicabile.
- `LICENSE` con ambito esplicito; `THIRD_PARTY_NOTICES.md`, registro licenze e regole di provenienza prima di distribuire contenuti. La licenza del repo non si estende ai materiali di terzi.

## 4. Roadmap viva

| Fase | Obiettivo e attività | Responsabile | Dipendenze / rischi | Criterio di completamento |
|---|---|---|---|---|
| 0. Visione e accordi | Risposte del team, tempo, scope, pilastri, decision log, regole per asset e contributi | Tutti; coordinatore da nominare | Disponibilità e competenze ignote | Scheda progetto concordata; ruoli e limiti; decisioni aperte esplicite |
| 1. Ricerca | Confronto piattaforme; verifica ufficiale delle mod candidate, licenze, loader, launcher e policy di distribuzione | Ricerca/tecnico da assegnare | Fonti/file cambiano; costi di compatibilità | Registro con fonti e versioni esatte, nessuna candidata inclusa per supposizione |
| 2. Prototipo minimo | Istanza pulita, loop esplorazione-incontro-ricompensa, prima bozza area/quest | Design + tecnico | Contenuti e dipendenze | Sessione verticale ripetibile e difetti bloccanti registrati |
| 3. Progressione alpha | Fasi, ricompense e contenuti essenziali | Design + integrazione | Bilanciamento e scope | Percorso breve giocabile con criteri misurabili |
| 4. Lore e aree | Alternative narrative, divinità/fazioni e una struttura/area originale | Narrativa + builder | Spoiler; worldgen e accessibilità | Approvazione esplicita dei concept prima dell'espansione |
| 5. Core/integrations | Confrontare config/datapack/script/mod; sviluppare solo gap verificati | Programmatore | Manutenzione, sicurezza e migrazioni | Test unitari/in-game e comportamento client/server documentati |
| 6. Identità audiovisiva | Materiali PBR di prova, shader opzionale, audio graduale | Art/audio | Hardware, licenze e carico creativo | Materiale leggibile senza shader; profili e licenze verificati |
| 7. QA | Singolo/co-op, performance, backup e restore; sessioni progressive | QA + team | Non dichiarare 10 giocatori prima dei test | Matrice test compilata, bug bloccanti chiusi, risultati riproducibili |
| 8. Beta | Build pubblica controllata, feedback e correzioni | Tutti | Moderazione e supporto | Criteri beta e canale feedback definiti |
| 9. CurseForge | Export ufficiale, policy, manifest/overrides, installazione pulita e moderazione | Release manager | Permessi e file esterni | Installazione pulita riuscita; crediti e pacchetto controllati |
| 10. Manutenzione | Compatibilità, aggiornamenti, migrazioni e supporto | Tutti | Rotture tra versioni | Note di rilascio, backup/migrazione e policy di supporto |

**Risultati di test:** nessuno ancora. Non è stata preparata né verificata una build.

### Ricerca preliminare (documentazione/pagine CurseForge, non test in gioco)
- **Apotheosis 1.20.1:** la pagina ufficiale elenca il file `Apotheosis-1.20.1-7.4.8.jar` (release, 25 aprile 2025); tra le dipendenze/progetti associati figurano Placebo, Patchouli, Apothic Attributes, Apothic Spawners e Apothic Enchanting. Verificare la pagina del file specifico, requisiti e comportamento prima della scelta. Fonte: https://www.curseforge.com/minecraft/mc-mods/apotheosis
- **Relics:** la pagina CurseForge mostra `relics-1.20.1-0.8.0.13.jar` per Forge. Fonte file: https://www.curseforge.com/minecraft/mc-mods/relics-mod/files/7708970
- **Reliquified Artifacts:** pagina CurseForge indica `rarcompat-1.20.1-0.5.jar` per Forge e licenza All Rights Reserved. La presenza del file non conferma da sola tutti i comportamenti elencati dall'utente o i permessi di redistribuzione. Fonte: https://www.curseforge.com/minecraft/mc-mods/reliquified-artifacts/files/7106942
- **Stato:** verifica preliminare delle pagine/files; dipendenze effettive, configurazioni, licenze delle altre mod candidate, modpack distribution e compatibilità reciproca restano da controllare file per file. Nessun test effettuato.
- **Port shelf Apotheosis:** ispezionato il ramo upstream `1.20`, commit `785d26e1f755bdcd97351b33f203cb9d9a33948a`. L'inventario iniziale e i vincoli sono documentati in [`docs/APOTHEOSIS_ENCHANTING_SHELF_PORT.md`](docs/APOTHEOSIS_ENCHANTING_SHELF_PORT.md). È stato creato lo scaffold Forge/Gradle in `mod/` con 20 shelf integrate (20 registri blocchi + item, JSON blockstate/model, 20 file `enchanting_stats` con valori Eterna/Quanta/Arcana/Rectification/Clues identici a Apotheosis 7.4.8), `IEnchantingBlock` di Apotheosis come API di integrazione e `NOTICE.md` per attribuzione. **Compilazione non ancora eseguita:** l'ambiente sandbox non raggiunge `services.gradle.org`/`maven.minecraftforge.net` e non ha `javac`; la build Forge reale resta da eseguire su una macchina con JDK 17 e rete accessibile ai repository Forge/CurseMaven. Nessun test in gioco.

## 5. Fase 0 — piano realistico

1. Ottenere le risposte alle domande iniziali; ciascun membro indica disponibilità settimanale, competenze e cosa vuole imparare.
2. Concordare 3–5 pilastri misurabili e una lista esplicita di “non fare nella milestone”. Non definire ancora pantheon, mod list o architettura finale.
3. Assegnare owner provvisori (design/narrativa, tecnica/integrations, arte/QA/release; ruoli combinabili) e un decisore per conflitti di scope.
4. Concordare workflow, backup, archiviazione dei mondi di test, convenzioni per log e protezione degli spoiler.
5. Avviare ricerca comparativa solo sulle funzioni che le risposte del team rendono prioritarie.

**Gate fase 0:** tutti e tre confermano scope, ruoli, tempo sostenibile, criteri della prima milestone e lista di decisioni ancora aperte.

## 6. Prima milestone — La prima spedizione

Proposta di fetta verticale, non ancora lore canonica:
- una zona iniziale compatta e un luogo pericoloso originale, costruito come area controllata prima di impegnarsi in worldgen complesso;
- una quest principale breve con obiettivo, scelta/ostacolo leggibile e ricompensa;
- un incontro culminante leggibile e severo, valutato in solo e in tre;
- una scoperta ambientale che suggerisce storia e rapporto col divino senza spiegare il pantheon;
- un assaggio visivo/audio provvisorio; nessun pacchetto shader, resource pack o soundtrack completa richiesti;
- un Vincolo singolo solo se il loop fondamentale è già stabile; prototipo esplicitamente sacrificabile.

**Ordine proposto:** (A) test tecnico vuoto e verifica launcher; (B) prototipo dell'incontro e della ricompensa; (C) area/quest con strumenti semplici; (D) test solo; (E) test in tre e ripetizione; (F) export `.mrpack` solo dopo controllo delle risorse e installazione pulita. Laby Launcher si verifica per primo su Forge pulito, Laby Client/addon separatamente; Prism è strumento diagnostico alternativo.

**Criteri di uscita proposti:** 60–90 minuti misurati; completabile in solo e gruppo da tre senza soft-lock; almeno una sessione di test per modalità; difficoltà e punti di frizione registrati; build e istruzioni ripetibili; asset e dipendenze con provenienza/licenza controllata. Non equivale a supporto dichiarato per 10 giocatori né a beta CurseForge.

## 7. Registro breve

- **Approvato:** obiettivi e vincoli espressi dall'utente; milestone come obiettivo.
- **Preferenza aggiornata:** l'utente prevede di realizzare il modpack da solo, non con un team di tre. Pianificazione, stime e criteri vanno ridimensionati per un solo autore; eventuali collaboratori potranno essere coinvolti più avanti.
- **Disponibilità:** circa un'ora al giorno (da trattare come circa 7 ore/settimana, con margine per imprevisti).
- **Hardware dichiarato:** Ryzen 7 7800X3D, Sapphire Radeon RX 7800 XT 16 GB, 32 GB RAM. Buona macchina personale per sviluppo e test; non rappresenta automaticamente il requisito minimo per il pubblico.
- **Preferenza tecnica:** Forge 1.20.1 è la priorità attuale, ancora da convalidare.
- **Direzione gameplay:** combattimento rapido, permissivo e immersivo; campagna lunga. Da tradurre in criteri verificabili senza rendere la prima milestone lunga quanto l'intera campagna.
- **Ipotesi di combattimento da valutare:** Epic Fight + Parcool + Elenai Dodge 2 + Parry + Critical Strike/Hit; Attack Indicator e Slash di Misantropy, e Critical Strike di daedelus_dev. È una proposta dell'utente, non una lista approvata: interazioni, dipendenze, versioni Forge 1.20.1 e sovrapposizioni di input/meccaniche sono da verificare prima di installare insieme.
- **Decisione approvata dall'utente:** realizzare nella core mod originale il port delle shelf dell'enchanting; includere Filtering Shelf e Treasure Shelf, escludendo per ora Rectifier e Library. La proposta di scope è approvata.
- **Architettura preferita:** usare Apotheosis standard come dipendenza/mod del pack e aggiungere le nostre shelf che contribuiscono alla tavola di Apotheosis; non ricreare da zero la tavola. Requisito esplicito: mantenere tavola e statistiche Eterna, Quanta e Arcana. Verificare l'integrazione supportata esattamente sulla build 1.20.1 selezionata prima di implementarla.
- **Condizioni ancora da verificare prima di implementare/distribuire:** confermare file/ramo sorgente preciso e licenza applicabile a ciascun componente; mantenere copyright e testo MIT per il codice riutilizzato e documentare modifiche; rispettare licenze separate degli asset (il LICENSE nel ramo 1.20 segnala alcuni asset CC BY 4.0); controllare dipendenze/API e termini CurseForge. Non riusare branding o asset senza verifica. L'integrazione nella core mod non annulla questi obblighi.
- **Lingua di pubblicazione:** modpack pubblicato in inglese. Pianificare testi, quest, UI e revisione linguistica in inglese; eventuali traduzioni aggiuntive restano aperte.
- **Riferimento ricevuto:** video YouTube `https://youtu.be/8TMDUPZwTso`. L'utente desidera la revisione meccanica completa di Relics e Artifacts vista nei modpack ATM: progressione, livellamento delle reliquie, gestione dell'esperienza e integrazione delle abilità dell'equipaggiamento. Non è ancora identificato un elenco di singoli oggetti/abilità, né verificata la disponibilità/compatibilità di tali sistemi su Forge 1.20.1.
- **Proposto:** struttura di repository/documentazione, piano fase 0, ordine della milestone.
- **Aperto:** nome, lore, divinità, mod list, mod originale, shader, modalità multiplayer e supporto a 10; esatte implementazioni dei sistemi ATM da riprodurre; criteri concreti di difficoltà; hardware minimo desiderato per i giocatori.
- **Prossimo passo:** ricerca mirata sulle versioni precise delle mod e sulle meccaniche ATM che interessano, comparata alla base Forge 1.20.1; poi una prova tecnica piccola. Evitare per ora di ricreare integralmente sistemi senza aver verificato costo, permessi e alternative.
